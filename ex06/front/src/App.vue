<template>
    <div id="app">
        <img alt="Vue logo" src="./assets/logo.png" />
        <EmpAllList />
    </div>
</template>

<script>
import EmpAllList from "./components/EmpAllList.vue";

export default {
    name: "App",
    components: {
        EmpAllList,
    },
};
</script>

<style>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
}
</style>
