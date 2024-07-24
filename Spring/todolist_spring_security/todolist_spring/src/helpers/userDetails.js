import React from 'react'

export default function userDetails() {

    const userItem = localStorage.getItem("user")
    if(!userItem){
        return null;
    }

    const user = JSON.parse(userItem);

    if(!user || user.data || user.data.token){
        return null;
    }

    const token = user.data.token

    const baseUrl = token.split(".")[1];
    if(!baseUrl){
        return null;
    }

    const base64 = baseUrl.replace(/-/g, '+').replace(/_/g, '/');

    const jsonPayload = decodeURIComponent(window.atob(base64).split('').map(function(c) {
        return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
    }).join(''));

    const decoded = JSON.parse(jsonPayload)
    return{ username : decoded.sub, role: decoded.roles}
}
