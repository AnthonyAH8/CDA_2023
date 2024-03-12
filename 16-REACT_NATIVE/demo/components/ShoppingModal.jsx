import { View, Text, Modal, Button, StyleSheet, Image, TextInput } from 'react-native'
import React, { useState } from 'react'

export default function ShoppingModal(props) {
    const [shoppingInput, setShoppingInput] = useState('');
    const [shopping, setShopping] = useState([]);

    function addNewFurniture(enteredInput) {
            setShopping(enteredInput)
    }

    

    return (
        <Modal visible={props.visible}>
            <View style={styles.container}>
                <Image
                    style={styles.monImage}
                    source={{ uri: 'https://cdn-icons-png.flaticon.com/512/6303/6303087.png' }}
                />
                <Text>Ma liste de courses:</Text>
                <TextInput
                    onChangeText={(text) => setShoppingInput(text)}
                    value={shoppingInput}
                    placeholder='Ajouter Course'
                    style={styles.shoppingInput}
                />
                <Button
                    title="Ajouter course"
                    onPress={(addNewFurniture)}
                />
            </View>
            <Button
                title='Retour à la liste'
                onPress={props.closeModal}
            />
        </Modal>
    );
}

const styles = StyleSheet.create({
    monImage: {
        width: 100,
        height: 100,
    },
    container: {
        flex: 1,
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
    },
    shoppingInput:{
        margin: 20,
        borderWidth: 1,
        padding: 10,
        width: 400,
        textAlign: 'center',
        borderRadius: 10,
    }
})