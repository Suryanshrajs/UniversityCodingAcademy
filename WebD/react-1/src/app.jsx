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
















import { Header } from "./components/Header.jsx"
import ProductTable from "./components/ProductTable.jsx";
export function App(){



    return (

        <>

            <header>
                <Header title="My application title" />
            </header>
            <main>
                <ProductTable />
            </main>
            <footer></footer>

        </>

    );
}