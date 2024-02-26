import { createBrowserRouter} from 'react-router-dom'
import Project from './components/Projects'
import App from './App'


const router = createBrowserRouter([
    {
        path:'/', element: <App/>
    },
    {
        path: '/projects/:monparams', element: <Project/>
    }
])

export default router;