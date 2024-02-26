import {createBrowserRouter} from 'react-router-dom';
import Homepage from './components/HomePage';
import Formpage from './components/FormPage';
import ErrorPage from './components/ErrorPage';
import Navbar from './components/Navbar';

const router = createBrowserRouter([
    // {path: '/', element: <Homepage/>, errorElement: <ErrorPage/>}, 
    // {path: '/form', element: <Formpage/>, errorElement: <ErrorPage/>},
    {
        path:'/', element: <Navbar/>, errorElement: <ErrorPage/>,
        children: [
            {path: '/', element: <Homepage/>},
            {path: '/form', element: <Formpage/>}
        ]
    }
])

export default router;