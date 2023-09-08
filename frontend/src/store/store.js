import Vuex from 'vuex';
import createPersistedState from 'vuex-persistedstate'

export default new Vuex.Store({
  state: {
    //username: '',
    token: ''
  },
  getters: {
    isLogin(state) {
      return state.token !== '';
    },
  },
  mutations: {
    logout(state, token) {
      localStorage.removeItem(token)
      state.token = ''
    },
    // setUsername(state, username) {
    //   state.username = username;
    // },
    setToken(state, token) {
      state.token = token;
    },
    // clearUsername(state) {
    //   state.username = '';
    // },
  },
  plugins: [
      createPersistedState()
  ]
});