import { FlatList, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'

export default function ShoppingList() {

    const [shoppingCart, setShoppingCart] = useState(false)

    const shop = [
        { stuff: 'pommes'},
        { stuff: 'fricadelles'}
    ]

  return (
    <View>
      <Text>ShoppingList</Text>
      <FlatList
      data={shop}
      renderItem={(s) => {
        return(
            <View>
                <Text>{s.item.stuff}</Text>
            </View>
        )
      }}
      keyExtractor={(item, index) =>{
        return index
      }}
      />
    </View>
  )
}

const styles = StyleSheet.create({})