import { View, Text, Button, FlatList, TextInput } from 'react-native'
import React, { useState } from 'react'
import TestModal from './TestModal';

export default function SecondDemo() {

    const [modalVisible, setModalVisible] = useState(false)
    const [textInput, setTextInput] = useState('')

    function ChangeInput(enteredInput){
        console.log(enteredInput);
        setTextInput(enteredInput)
    }

    const tableau = [
        { text: 'toto', id: 1},
        { text: 'titi', id: 2},
        { text: 'tata', id: 3},
    ]

    function messageConsole() {
        console.log("Bienvenue");
        setModalVisible(true)
    }

    function closeModal(){
        setModalVisible(false)
    }


    return (
        <View>
            <Text>Seconde Demo</Text>
            <Button
                title='Mon Bouton'
                onPress={messageConsole}
            />
            <TestModal visible={modalVisible} closeModal={closeModal}></TestModal>
            <FlatList
            data={tableau}
            renderItem={(tabData) => {
                return(
                    <View>
                        <Text>{tabData.item.text} - {tabData.item.id}</Text>
                    </View>
                )
            }}
            keyExtractor={(item, index) =>{
                return index;
            }}
            />
            <TextInput
            onChangeText={ChangeInput}
            value={textInput}
            />
        </View>
    )
}
