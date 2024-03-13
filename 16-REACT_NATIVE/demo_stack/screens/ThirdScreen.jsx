import { Button, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function ThirdScreen({ navigation }) {
    return (
        <View>
            <Text>Accueil (ThirdScreen)</Text>
            <View>

                <Text>Vers FirstScreen</Text>
                <Button
                    title='Go to FirstScreen'
                    onPress={() => navigation.navigate('FirstScreen')}></Button>
            </View>
            <View>
                <Text>Vers SecondScreen avec un params value qui contient toto et l'ID</Text>
                <Button
                    title='Go to SecondScreen'
                    onPress={() => navigation.navigate('SecondScreen', {value: 'Toto', id: 1})}></Button>
                    <Text>Vers SecondScreen avec un params value qui contient tata</Text>
                    <Button
                    title='Go to SecondScreen'
                    onPress={() => navigation.navigate('SecondScreen', {value: 'Tata'})}></Button>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({})