import {createBrowserRouter} from "react-router-dom"
import MoviesList from "./components/MoviesList"
import MoviesForm from "./components/MoviesForm"

const router = createBrowserRouter([
    {
        path: '/',
        element: <MoviesList/>
    },
    {
        path: '/detail/:id',
        element: <MoviesForm/>
    }
])

export default router