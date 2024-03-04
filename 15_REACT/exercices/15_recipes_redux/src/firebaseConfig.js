// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyCIDSNum9dKZs5VxbeXK-NcNL8VFe8DQaI",
  authDomain: "m2i-cda-c0875.firebaseapp.com",
  databaseURL: "https://m2i-cda-c0875-default-rtdb.europe-west1.firebasedatabase.app/",
  projectId: "m2i-cda-c0875",
  storageBucket: "m2i-cda-c0875.appspot.com",
  messagingSenderId: "547841623334",
  appId: "1:547841623334:web:d4aee3ab920cb49ad8ede7"
};

export const BASE_DB_URL = firebaseConfig.databaseURL;
export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`;
export const SIGN_IN_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=${firebaseConfig.apiKey}`;

// Initialize Firebase
const app = initializeApp(firebaseConfig);