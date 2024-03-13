import { Button, Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'

export default function Calculator() {
    const [displayValue, setDisplayValue] = useState(0);
    const [operator, setOperator] = useState(null)
    const [value, setValue] = useState("")

    const numberInput = (number) => {
        if (displayValue === '0') {
            setDisplayValue(number.toString());
        } else {
            setDisplayValue(displayValue + number);
        }
    }

    const answer = (newOperator) => {
        setOperator(newOperator);
        setValue(displayValue);
        setDisplayValue('0');
    };

    const operation = () => {
        const a = Number(value);
        const b = Number(displayValue);
    
        if (operator === '+') {
            setDisplayValue(a + b);
        } else if (operator === '-'){
            setDisplayValue(a - b);
        } else if (operator === '*'){
            setDisplayValue(a * b);
        } else if (operator === '/'){
            setDisplayValue(a / b);
        } else if (operator === '^'){
            setDisplayValue(Math.pow(a, b))
        } else if(operator === '%') {
            setDisplayValue(a % b)
        }
    
        setOperator(null);
        setValue('');
    };

    const clear = () => {
        setDisplayValue('0')
        setOperator(null)
        setValue('')
    }
    
 
    return (
        <View style={styles.container}>
                <Text style={styles.title}>Calculatrice</Text>
                <Text style={styles.result}>{displayValue}</Text>
            <View style={styles.main}>
                <Pressable onPress={clear}><Text style={styles.elements}>AC</Text></Pressable>
                <Pressable
                onPress={() => answer('^')}><Text style={styles.elements}>^</Text></Pressable>
                <Pressable
                onPress={() => answer('%')}><Text style={styles.elements}>%</Text></Pressable>
                <Pressable
                onPress={() => answer('/')}><Text style={styles.elements}>/</Text></Pressable>
                <Pressable
                onPress={() => numberInput(7)}><Text style={styles.numbers}>7</Text></Pressable>
                <Pressable
                onPress={() => numberInput(8)}><Text style={styles.numbers}>8</Text></Pressable>
                <Pressable
                onPress={() => numberInput(9)}><Text style={styles.numbers}>9</Text></Pressable>
                <Pressable
                onPress={() => answer('*')}><Text style={styles.elements}>X</Text></Pressable>
                <Pressable
                onPress={() => numberInput(4)}><Text style={styles.numbers}>4</Text></Pressable>
                <Pressable
                onPress={() => numberInput(5)}><Text style={styles.numbers}>5</Text></Pressable>
                <Pressable
                onPress={() => numberInput(6)}><Text style={styles.numbers}>6</Text></Pressable>
                <Pressable
                onPress={() => answer('-')}><Text style={styles.elements}>-</Text></Pressable>
                <Pressable
                onPress={() => numberInput(1)}><Text style={styles.numbers}>1</Text></Pressable>
                <Pressable
                onPress={() => numberInput(2)}><Text style={styles.numbers}>2</Text></Pressable>
                <Pressable
                onPress={() => numberInput(3)}><Text style={styles.numbers}>3</Text></Pressable>
                <Pressable
                onPress={() => answer('+')}><Text style={styles.elements}>+</Text></Pressable>
                <Pressable
                onPress={() => numberInput('.')}><Text style={styles.numbers}>.</Text></Pressable>
                <Pressable
                onPress={() => numberInput(0)}><Text style={styles.numbers}>0</Text></Pressable>
                <Pressable
                ><Text style={styles.numbers}>Del</Text></Pressable>
                <Pressable
                onPress={operation}><Text style={styles.elements}>=</Text></Pressable>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: 'black',
        flex: 1,
        textAlign: 'center',
        justifyContent: 'space-between',
    },
    title: {
        color: 'white',
        textAlign: 'center',
        justifyContent: 'center',
        margin: 10,
        fontWeight: 'bold',
        fontSize: 24
    },
    main:{
        display: 'flex',
        flexWrap: 'wrap',
        flexDirection: 'row',
        justifyContent: 'center'
    },
    elements:{
        display: 'flex',
        color: 'white',
        backgroundColor: 'grey',
        width: 90,
        height: 90,
        textAlign: 'center',
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: 20,
        padding: 28,
        margin: 10,
        fontWeight: 'bold',
        fontSize: 24
    },
    numbers:{
        backgroundColor: 'white',
        width: 90,
        height: 90,
        textAlign: 'center',
        alignItems: 'center',
        justifyContent: 'center',
        display: 'flex',
        borderRadius: 45,
        padding: 27,
        margin: 10,
        fontWeight: 'bold',
        fontSize: 24
    },
    result:{
        color: 'lightgrey',
        textAlign: 'right',
        fontSize: 60
    }
    })