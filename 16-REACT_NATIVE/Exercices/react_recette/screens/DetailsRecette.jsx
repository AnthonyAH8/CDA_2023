import { FlatList, StyleSheet, Text, TouchableOpacity, View } from 'react-native'
import React from 'react'
import { MEALS } from '../data/data' 

export default function DetailsRecette({ navigation }) {
  return (
    <View>
        <FlatList
        data={MEALS}
        renderItem={(itemRecette) =>{
            return(
                <TouchableOpacity onPress={() => navigation.navigate}>

                </TouchableOpacity>
            )
        }}
        />
    </View>
  )
}

const styles = StyleSheet.create({})