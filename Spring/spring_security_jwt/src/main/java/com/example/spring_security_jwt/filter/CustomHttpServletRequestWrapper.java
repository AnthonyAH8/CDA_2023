package com.example.spring_security_jwt.filter;

import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class CustomHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private final String body;

    public CustomHttpServletRequestWrapper(HttpServletRequest request, String body) throws IOException {
        super(request);
        this.body = body;
    }

    private String getBody(HttpServletRequest request) throws IOException {
        StringBuilder result = new StringBuilder();
        try (InputStream inputStream = request.getInputStream();
             Scanner scanner = new Scanner(inputStream, "UTF-8")) {
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine());
            }
        }
        return result.toString();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body.getBytes());
        return new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return byteArrayInputStream.read();
            }

            @Override
            public boolean isFinished() {
                return byteArrayInputStream.available() == 0;
            }

            @Override
            public boolean isReady() {
                return true;
            }


            @Override
            public void setReadListener(ReadListener readListener) {

            }
        };
    }
}
