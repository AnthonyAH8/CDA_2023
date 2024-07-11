import {createBrowserRouter} from 'react-router-dom'
import Employee from './components/Employee'
import Candidate from './components/Candidate'
import Home from './components/Home'
import CandidateList from './components/CandidateList'
import EmployeeList from './components/EmployeeList'

const router = createBrowserRouter([
    {
        path: "/",
        element: <Home/>
    },
    {
        path: "/employee",
        element: <Employee/>
    },
    {
        path: "/candidate",
        element: <Candidate/>
    },
    {
        path: "/candidate/list",
        element: <CandidateList/>
    },
    {
        path: "/employee/list",
        element: <EmployeeList/>
    },
])

export default router;