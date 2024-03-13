import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function SecondScreen({navigation, route}) {
    const value = route.params.value
    const id = route.params.id
  return (
    <View>
      <Text>SecondScreen</Text>
      <Text>Value : {value}</Text>
      <Text>ID : {id}</Text>
    </View>
  )
}

const styles = StyleSheet.create({})