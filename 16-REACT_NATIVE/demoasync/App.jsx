import React, { useState } from 'react'
import { Button, StyleSheet, Text, View } from 'react-native'
import AsyncStorage from '@react-native-async-storage/async-storage'

export default function App() {
  const [objectValue, setObjectValue] = useState({ firstname: '', lastname: '' })

  const addObjectValue = async () => {
    try {
      const objectString = JSON.stringify({ firstname: 'toto', lastname: 'titi' })
      await AsyncStorage.setItem('key', objectString)
      setObjectValue(objectString)
    } catch (error) {
      console.log(error)
    }
  }

  const getObjectValue = async () => {
    try {
      const objectString = await AsyncStorage.getItem('key')
      if (objectString !== null) {
        setObjectValue(JSON.parse(objectString))
      } else {
        setObjectValue({ firstname: '', lastname: '' }) 
      }
    } catch (error) {
      console.log(error)
    }
  }

  return (
    <View>
      <Text>Valeur stockée : {JSON.stringify(objectValue)}</Text>
      <Button title="Ajouter" onPress={addObjectValue} />
      <Button title="Recupérer" onPress={getObjectValue} />
    </View>
  )
}

const styles = StyleSheet.create({})
