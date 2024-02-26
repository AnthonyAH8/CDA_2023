import {createBrowserRouter} from 'react-router-dom'
import Navbar from './components/Navbar'
import Errorpage from './components/Errorpage'
import Homepage from './components/Homepage'
import Description from './components/Description'
import Formpage from './components/Formpage'

const router = createBrowserRouter([
    {
        path: '/', element: <Navbar/>, errorElement: <Errorpage/>,
        children: [
            {path:'/', element: <Homepage/>},
            {path: '/about', element: <Description/>},
            {path: '/form', element: <Formpage/>}
        ]
    }
])

export default router;