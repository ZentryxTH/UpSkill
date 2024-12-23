"use client"
import Image from "next/image";
import { useEffect, useState } from "react";
import { Axios, AxiosError } from "axios";
import axios from "axios";

export default function Home() {

  // State Hook //
  // const [count, setCount] = useState(0);
  // const handleButtonClick = () => {
  //   setCount(count + 1);
  // };

  // TS interfaces //
  interface Joke{
    id: number;
    type: string;
    setup: string;
    punchline: string;
  }

  // Axios
  const callJokeAPI = async() => {
    let config = {
      method: 'get',
      maxBodyLength: Infinity,
      url: 'https://official-joke-api.appspot.com/random_joke',
      headers: { }
    };
    
    try{
      const response = await axios.request(config);
      return response.data;
    }
    catch(error : AxiosError | any){
      console.log(error);
      return error;
    }
  }
  
  const [myJoke, setMyJoke] = useState<Joke | any>(null);
  useEffect(() => {
    const getJoke = async () => {
      const joke = await callJokeAPI();
      setMyJoke(joke);
    }
    getJoke();
  }, []);

  return (
    // <div>
    //   <button type="button" onClick={handleButtonClick}>Count: {count}</button>
    // </div>
    <div>
      <h1>Joke: </h1>
      {myJoke ? (<div>
        <p>{myJoke.id}</p>
        <p>{myJoke.setup}</p>
        <p>{myJoke.punchline}</p>
      </div>) : (<p>loading</p>)}
    </div>
  );
}
