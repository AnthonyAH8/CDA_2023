import { Button, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'

export default function Calculator() {
    const [input, setInput] = useState("")
    const [displayValue, setDisplayValue] = useState(0);
    const [operator, setOperator] = useState(null)

    return (
        <View style={styles.container}>
                <Text style={styles.title}>Calculatrice</Text>
            <View style={styles.main}>
                <Button title='AC'/>
                <Button title='^' />
                <Button title='%' />
                <Button title='/' />
                <Button title='7' />
                <Button title='8' />
                <Button title='9' />
                <Button title='*' />
                <Button title='4' />
                <Button title='5' />
                <Button title='6' />
                <Button title='-' />
                <Button title='3' />
                <Button title='2' />
                <Button title='1' />
                <Button title='+' />
                <Button title='.' />
                <Button title='0' />
                <Button title='Del' />
                <Button title='=' />
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: 'black',
        flex: 1,
    },
    title: {
        color: 'white',
        textAlign: 'center',
        margin: 10,
        fontWeight: 'bold',
        fontSize: 24
    },
    main:{
        flexWrap: 'wrap',
        flexDirection: 'row'
    }
    })