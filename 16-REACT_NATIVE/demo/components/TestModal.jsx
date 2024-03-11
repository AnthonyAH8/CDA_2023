import { Button, Modal, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function TestModal(props) {
  return (
    <Modal visible={props.visible}>
        <View>
            <Text>Hello</Text>
            <Button title='CloseModal'
            onPress={props.closeModal}
            ></Button>
        </View>
    </Modal>
  )
}

const styles = StyleSheet.create({})