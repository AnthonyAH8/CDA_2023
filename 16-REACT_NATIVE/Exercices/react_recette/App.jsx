import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import HomeRecette from './screens/HomeRecette'
import DetailsRecette from './screens/DetailsRecette'
import DescriptionRecette from './screens/DescriptionRecette'

const Tab = createBottomTabNavigator()

export default function App() {
  return (
    <NavigationContainer>
        <Tab.Navigator>
            <Tab.Screen name='HomeRecette' component={HomeRecette}/>
            <Tab.Screen name='RecetteDetails' component={DetailsRecette}/>
          <Tab.Screen name='DescriptionRecette' component={DescriptionRecette}/>
        </Tab.Navigator>
    </NavigationContainer>
  )
}

const styles = StyleSheet.create({})