import { Button, FlatList, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import ContactButton from './ContactButton'

const contactList = [
    {
        firstname: 'John',
        lastname: 'Doe',
    },
    {
        firstname: 'Jane',
        lastname: 'Doe',
    },

];

export default function ContactList({ navigation }) {

    return (
        <View style={styles.container}>
            <Text style={styles.title}>Liste des contacts</Text>
            <View styles={styles.list}>
                <ContactButton
                    title='Toto Titi'
                    onPress={() => navigation.navigate('ContactDetails', { firstname: 'Toto', lastname: 'Titi', number: '0123456789' })}
                ></ContactButton>
                <ContactButton
                    title='John Doe'
                    onPress={() => navigation.navigate('ContactDetails', { firstname: 'John', lastname: 'Doe', number: '9876543210' })}>
                </ContactButton>
                <ContactButton
                    title='Titi Toto'
                    onPress={() => navigation.navigate('ContactDetails', { firstname: 'Titi', lastname: 'Toto', number: '7896542130' })}>
                </ContactButton>
                <ContactButton
                    title='Jane Doe'
                    onPress={() => navigation.navigate('ContactDetails', { firstname: 'Jane', lastname: 'Doe', number: '7418529630' })}>
                </ContactButton>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: "#FAEBD7",
        flex: 1,
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
    },
    title: {
        fontSize: 32,
        marginBottom: 50,
    },

})