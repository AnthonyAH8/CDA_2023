import { Button, Linking, StyleSheet, Text, View } from 'react-native'
import React, { useLayoutEffect } from 'react'
import ContactButton from './ContactButton'

export default function ContactDetails({ navigation, route }) {

    const firstname = route.params.firstname
    const lastname = route.params.lastname
    const number = route.params.number

    useLayoutEffect(() => {
        navigation.setOptions({ title: firstname + ' ' + lastname })
    }, [])

    function callContact() {
        Linking.openURL(`tel: ${number}`)
    }
    return (
        <View style={styles.container}>
            <Text style={styles.fullname}>{firstname} {lastname}</Text>
            <View>
                <Text><Text style={styles.infos}>Prénom:</Text> {firstname}</Text>
                <Text><Text style={styles.infos}>Nom:</Text> {lastname}</Text>
                <Text><Text style={styles.infos}>Numéro de téléphone: </Text> {number}</Text>
            </View>
            <ContactButton
                title='Appeler'
                onPress={callContact} />
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: "#FAEBD7",
        flex: 1,
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'space-around',
    },
    fullname: {
        fontSize: 40,
        font: 'bold',
    },
    infos:{
        fontWeight: 'bold'
    }
})