import {createBrowserRouter} from "react-router-dom"
import CountryList from "./components/CountryList"

const router = createBrowserRouter([
    {
        path: '/',
        element: <CountryList/>
    },
])

export default router