// export function header(){
//     return "hello word" //it is a function of react not an html element
// }




export function myheader(){
    let appTitle = "Online Product Store"
    return(
        <div>
            <h2 style={{textAlign: "center"}} >{appTitle}</h2>
        </div>
    )
}