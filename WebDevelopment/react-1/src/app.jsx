// import {myheader as Myheader} from "./myheader"
// import productList from "./productList";

// // export function app(val){

// //     return <Header>${val}</Header> //it is a function of react not an html element
// // }


// export function app(){
//     return(
//     <header>
//         <myheader>

//         </myheader>
//     </header>)
// }
















import { Myheader } from "./myheader.jsx"
import {ProductList} from "./productList.jsx";
export function App(){



    return (

        <>

            <header>
                <Myheader title="My application title" />
            </header>
            <main>
                <ProductList />
            </main>
            <footer></footer>

        </>

    );
}