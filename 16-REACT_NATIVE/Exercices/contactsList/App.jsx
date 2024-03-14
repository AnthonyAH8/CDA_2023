import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { NavigationContainer } from '@react-navigation/native'
import ContactList from './screens/ContactList'
import ContactDetails from './screens/ContactDetails'

const Stack = createNativeStackNavigator()

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name='ContactList' component={ContactList} options={{ headerShown: false }} />
        <Stack.Screen
          name='ContactDetails'
          component={ContactDetails}
          options={({ route }) => ({ title: route.params.firstname })}
        />
      </Stack.Navigator>
    </NavigationContainer>
  )
}

const styles = StyleSheet.create({})