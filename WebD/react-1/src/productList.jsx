import productData from "../../public/data.js";
import { useState } from "react";

function ProductTable(){


    const [productList, setProductList] = useState([]);

    setTimeout(() => {
        
        setProductList(productData);

    }, 1000);

    const tableStyle = {fontFamily:"sans-serif", borderCollapse:"collapse", border:"2px solid black"};
    const dataStyle = {border:"2px solid black", padding:"10px"};

    return (

        <div>
            <table style={tableStyle}>
                <thead>
                    <th style={dataStyle}>Product Name</th>
                    <th style={dataStyle}>Product Description</th>
                    <th style={dataStyle}>Product Price</th>    
                </thead>
                <tbody>

                    {productList.map((product, index) => {

                        return (

                            <tr key={index}>

                                <td style={dataStyle}>{product.name}</td>
                                <td style={dataStyle}>{product.description}</td>
                                <td style={dataStyle}>{product.price}</td>

                            </tr>
                            
                        );

                    })}

                </tbody>
            </table>
        </div>

    );



}

export default ProductTable;