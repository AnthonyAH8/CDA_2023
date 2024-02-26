import { createBrowserRouter} from 'react-router-dom'
import App from './App'
import Contacts from './components/Contacts'

const router = createBrowserRouter([
    {
        path: '/', element: <App/>
    },
    {
        path: '/contacts/:params', element: <Contacts/>
    }
])

export default router;