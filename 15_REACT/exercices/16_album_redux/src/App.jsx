import { useState } from 'react'
import './App.css'
import SignForm from './components/auth/SignForm'
import AlbumHeader from './components/album/AlbumHeader'
import AddAlbumForm from './components/album/AddAlbumForm'
import AlbumDisplay from './components/album/AlbumDisplay'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <AlbumHeader />
      <SignForm />
      <AddAlbumForm/>
      <AlbumDisplay/>
    </>
  )
}

export default App
