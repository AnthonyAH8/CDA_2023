import {createBrowserRouter} from 'react-router-dom'
import PokemonList from './components/pokemon/PokemonList'
import PokemonDetails from './components/pokemon/PokemonDetails'

const router = createBrowserRouter([
    {
        path: '/',
        element: <PokemonList/>
    },
    {
        path: '/:id',
        element: <PokemonDetails/>
    }
])

export default router