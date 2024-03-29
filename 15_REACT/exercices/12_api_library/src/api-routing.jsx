import { createBrowserRouter} from 'react-router-dom'
import BookList from './components/BookList'
import BookDetails from './components/BookDetails'

const router = createBrowserRouter([
    {
        path: '/',
        element: <BookList/>
    },
    {
        path: '/works/:olid',
        element: <BookDetails/>
    }
])

export default router