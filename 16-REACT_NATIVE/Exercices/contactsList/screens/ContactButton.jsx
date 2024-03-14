import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function ContactButton({onPress, title}) {
  return (
    <Pressable
    onPress={onPress}>
        <View style={styles.button}>
            <Text style={styles.text}>{title}</Text>
        </View>
    </Pressable>
  )
}

const styles = StyleSheet.create({
    button:{
        display: 'flex',
        backgroundColor: "lightblue",
        width: 200,
        margin: 15,
        padding: 10,
        borderRadius: 10,
    },
    text: {
        color: 'white',
        textAlign: 'center',
        fontWeight: 'bold'
    }
})