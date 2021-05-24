package ObjectHeirarchyTest

import ObjectHeirarchy.AssetInventory

ObjectGraphBuilder builder = new ObjectGraphBuilder()
builder.classNameResolver = "ObjectHeirarchy"

AssetInventory shipRegistry = builder.assetInventory() {
    ship(name: "Ship1", destination: "Kazakhsthan") {
        crewMember(firstName: "Deepson", lastName: "Shrestha", age: 22)
        crewMember(firstName: "Aashika", lastName: "Rai", age: 21)
        cargo(type: "water", tons: 2.1) {
            cargoOrder(buyer: "Simp", city: "Kathmandu", price: 27000)
        }
        cargo(type: "er", tons: 1) {
            cargoOrder(buyer: "p", city: "andu", price: 7000)
        }
    }
    ship(name: "Ship2", destination: "Pakisthan") {
        crewMember(firstName: "son", lastName: "Shres", age: 22)
        crewMember(firstName: "Aashik", lastName: "Rai", age: 21)
        cargo(type: "water", tons: 2.1) {
            cargoOrder(buyer: "Si", city: "man", price: 27000)
        }
        cargo(type: "er", tons: 1) {
            cargoOrder(buyer: "postman", city: "chandupandu", price: 7000)
        }
    }
}

    println shipRegistry.ships.size


