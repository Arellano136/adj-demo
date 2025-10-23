import TestController from "./modules/test/test.Controller"

function App() {
  
  return (
    <>
    <nav className="nabvar navnar-expand.lg bg-body-tertiary">
      <div className="container-fluid">
      <a href="" className='navabr-brand'>ADJ Demon</a>
      </div>
      <div className='collapse navbar-collapse'>
        <ul className='navbar-nav'>
          <li className='nav-item'>
            <a href="" className='nav-link active'>
          Home
        </a>
          </li>
        </ul>
      </div>
    </nav>
    <div className='container mt-5'>
    <h2>Incio</h2>
<br />
<button onClick={{}=TestController.callToApi} className='btn btn-success'>Llamar api </button>
    </div>
    </>
  )
}
//server
//java
//maven
//adj.demo
//21 amazon toretto
//21
//carpeta 

//utils 
//dBConnection 
//jpa
export default App
