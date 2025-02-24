import React, { useEffect, useState }  from 'react';
import axios from "axios";
import logo from './logo.svg';
import './App.css';

function App() {
  const [data, setData] = useState('')

  useEffect(() => {
    axios.get('/api/data')
    .then(res => setData(res.data))
    .catch(err => console.log(err))
  }, []);


  return (
    <div className="App">
      받아온값 : {data}
    </div>
  );
}

export default App;
