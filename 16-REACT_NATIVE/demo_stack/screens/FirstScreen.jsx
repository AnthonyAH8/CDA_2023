import { Button, Linking, StyleSheet, Text, View } from 'react-native'
import React, { useLayoutEffect } from 'react'

export default function FirstScreen({ navigation }) {

  function call(){
    Linking.openURL(`tel:0123456789`)
  }

  useLayoutEffect(() => {
    navigation.setOptions({title: 'Titi'})
  }, [])

  return (
    <View>
      <Text>FirstScreen</Text>
      <Button
      title='Appeler'
      onPress={call}/>
    </View>
  )
}

const styles = StyleSheet.create({})