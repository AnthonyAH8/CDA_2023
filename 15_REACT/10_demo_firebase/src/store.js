import { configureStore } from "@reduxjs/toolkit"
import authSlice from "./components/auth/authSlice"
import TaskSlice from "./components/task/TaskSlice"

export default configureStore({
    reducer:{
        auth: authSlice,
        task: TaskSlice
    }
})