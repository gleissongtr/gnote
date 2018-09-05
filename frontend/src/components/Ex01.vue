<template>
  <div>
    Gasto:
    <div>ID: {{gasto.id}}</div>
    <div>DESCRIÇÃO: {{gasto.descricao}}</div>
    <div>VALOR: {{gasto.valor}}</div>
    <div>DATA: {{gasto.data}}</div>

    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'ex01',
  data () {
    return {
      gasto: {},
      msg: 'exemplo 01'
    }
  },
  methods: {
    buscar () {
      alert(axios)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
