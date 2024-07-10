import {createBrowserRouter} from 'react-router-dom'
import Employee from './components/Employee'
import Candidate from './components/Candidate'

const router = createBrowserRouter([
    {
        path: "/employee",
        element: <Employee/>
    },
    {
        path: "/candidate",
        element: <Candidate/>
    }
])

export default router;