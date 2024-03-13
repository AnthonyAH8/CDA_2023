import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import FirstScreen from '../demo_stack/screens/FirstScreen'
import SecondScreen from '../demo_stack/screens/SecondScreen'
import ThirdScreen from '../demo_stack/screens/ThirdScreen'

const Stack = createNativeStackNavigator()

export default function App() {

  return (
    <NavigationContainer>
        <Stack.Navigator initialRouteName='ThirdScreen'>
            <Stack.Screen name='FirstScreen' component={FirstScreen} options={{title : 'PageA'}}/>
            <Stack.Screen name='SecondScreen' component={SecondScreen}/>
            <Stack.Screen name='ThirdScreen' component={ThirdScreen} options={{headerShown : false}}/>
        </Stack.Navigator>
    </NavigationContainer>
  )
}

const styles = StyleSheet.create({})