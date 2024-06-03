package org.example;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class RechercheVille {
    private List<String> villes;

    String[] citiesList = {"Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam",
            "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"};

    public List<String> rechercher(String mot) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not found");
    }
}
