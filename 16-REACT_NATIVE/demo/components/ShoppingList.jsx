import { Button, FlatList, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import ShoppingModal from './ShoppingModal'

export default function ShoppingList(props) {

  const [modalVisible, setModalVisible] = useState(false);
  const [shop, setShop] = useState([
      { stuff: 'pommes' },
      { stuff: 'poires' }
  ]);

  function closeModal() {
      setModalVisible(false);
  }

  function goToModal() {
      setModalVisible(true);
  }

  function addNewFurniture(newItem) {
      setShop([...shop, { stuff: newItem }]);
      closeModal();
  }

  return (
      <View style={styles.furniture}>
          <Text style={styles.title}>Ma liste de courses:</Text>
          <ShoppingModal visible={modalVisible} closeModal={closeModal} addNewFurniture={addNewFurniture} />
          <FlatList
              data={shop}
              renderItem={(s) => (
                  <View>
                      <Text>{s.item.stuff}</Text>
                  </View>
              )}
              keyExtractor={(item, index) => index.toString()}
              style={styles.liste}
          />
          <Button
              title='Ajouter article'
              onPress={goToModal}
          />
      </View>
  )
}

const styles = StyleSheet.create({
  title:{
    fontSize: 24
  },
  furniture: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
  },
  liste:{
    marginBottom: 20
  }
})