import React from "react";

import Imagem1 from "../../assets/img/argonath.jpg";
import Imagem2 from "../../assets/img/argonath1.jpg"

export default function Home() {
    return (
        <body className="imagem-fundo">

  <header>

    <nav className="menu-principal">
      <div><a href="index.html"><img src="imagens/Logo-oficial.png" className="logo" alt="Logo do site"></a></div>
      <div>
        <a href="index.html"><button>Home</button></a>
        <a href="destino.html"><button>Destino</button></a>
        <a href="promocoes.html"><button>Promoções</button></a>
        <a href="contato.html"><button>Contato</button></a>
      </div>
      <div><input type="search" className="pesquisa1" placeholder="Buscar no site">
        <button className="pesquisa">Pesquisar</button>
      </div>
    </nav>

  </header>

<section>
    <div className="formulario-passagem">
    <div className="radio1">
        <h4 style="color: green">Passagens Aéreas</h4>
        <label for="radio-idaevolta"><input type="radio" className="radio" name="destino" id="radio-idaevolta">Ida e Volta</label>
        
        <label for="radio-soida"><input type="radio" className="radio" name="destino" id="radio-soida">Só ida</label>
                        
        <label for="radio-multidestino"><input type="radio" className="radio" name="destino" id="radio-multidestino" checked>Multidestino</label>
    </div>

    <div>
      <input type="text" placeholder="Origem" id="origem" className="origem">
      
      <input type="text" placeholder="Destino" id="destino" className="destino">
    </div>

    <div>
      <label for="dataida">Data da Ida</label>
      <input type="date" id="dataida">
      <label for="datavolta">Data da Volta</label>
      <input type="date" id="datavolta">
    </div>
    <div>
      <label for="passageiros">Passageiros</label>
      <input type="number" id="passageiros">
    </div>
    <div>
      <button className="botao">Pesquisar</button>

    </div>
    
    </div>
            
</section>

<h3 className="titulo">O Site de viagens da Terra Média!</h3>
<br>


<div className="container">
  <div className="carrosel">
    <div id="carouselExampleCaptions" className="carousel slide" data-bs-ride="false">
      <div className="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" className="active"
          aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
          aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
          aria-label="Slide 3"></button>
      </div>
      <div className="carousel-inner">
        <div className="carousel-item active">
          <a href="promocoes.html"><img src="imagens/condado1.jpg" className="d-block w-100" alt="Condado"></a>
          <div className="carousel-caption d-none d-md-block">
            <a href="promocoes.html"><h5 style="color: white;">O Condado</h5></a>
            <a href="promocoes.html"><p style="color: white;">Lar dos Hobbits.</p></a>
          </div>
        </div>
        <div className="carousel-item">
          <a href="promocoes.html"><img src="imagens/edoras.jpg" className="d-block w-100" alt="Edoras-rohan"></a>
          <div className="carousel-caption d-none d-md-block">
            <a href="promocoes.html"><h5 style="color: white;">Édoras-Rohan</h5></a>
            <a href="promocoes.html"><p style="color: white;">A terra dos cavaleiros.</p></a>
          </div>
        </div>
        <div className="carousel-item">
          <a href="promocoes.html"><img src="imagens/Esgaroth.jpg" className="d-block w-100" alt="Vale"></a>
          <div className="carousel-caption d-none d-md-block">
            <a href="promocoes.html"><h5 style="color: white;">Esgaroth</h5></a>
            <a href="promocoes.html"><p style="color: white;">A cidade do lago.</p></a>
          </div>
        </div>
      </div>
      <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
        data-bs-slide="prev">
        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
        <span className="visually-hidden">Previous</span>
      </button>
      <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
        data-bs-slide="next">
        <span className="carousel-control-next-icon" aria-hidden="true"></span>
        <span className="visually-hidden">Next</span>
      </button>
    </div>
  </div>
</div>
</div>

  <section className="cards">
    <article className="card card--1">
      <div className="card__info--hover"></div>
      <div className="card__img"></div>
      <a href="destino.html" className="card_link">
        <div className="card__img--hover"></div>
      </a>
      <div className="card__info">
        <a href="destino.html"><span className="card__category">Pacote para Argonath</span>
        </a>
        <a href="destino.html">
          <h3 className="card__title">Reserve agora </h3>
        </a>
      </div>
    </article>

    <article className="card card--2">
      <div className="card__info--hover"></div>
      <div className="card__img"></div>
      <a href="destino.html" className="card_link">
        <div className="card__img--hover"></div>
      </a>
      <div className="card__info">
        <a href="destino.html"><span className="card__category">Pacote para Valfenda</span>
        </a>
        <a href="destino.html">
          <h3 className="card__title">Reserve agora</h3>
        </a>
      </div>
    </article>

    <article className="card card--3">
      <div className="card__info--hover"></div>
      <div className="card__img"></div>
      <a href="destino.html" className="card_link">
        <div className="card__img--hover"></div>
      </a>
      <div className="card__info">
        <a href="destino.html"><span className="card__category">Pacote para Erebor</span>
        </a>
        <a href="destino.html">
          <h3 className="card__title">Reserve agora</h3>
        </a>
      </div>
    </article>
  </section>


  <footer className="text-center text-lg-start bg-light text-muted">
    
    <section className="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
      
      <div className="me-5 d-none d-lg-block">
        <span>Conecte-se conosco nas redes sociais:</span>
      </div>
      
      <div>
        <a href="" className="me-4 text-reset">
          <i className="fab fa-facebook-f"></i>
        </a>
        <a href="" className="me-4 text-reset">
          <i className="fab fa-twitter"></i>
        </a>
        <a href="" className="me-4 text-reset">
          <i className="fab fa-google"></i>
        </a>
        <a href="" className="me-4 text-reset">
          <i className="fab fa-instagram"></i>
        </a>
        <a href="" className="me-4 text-reset">
          <i className="fab fa-linkedin"></i>
        </a>
        <a href="" className="me-4 text-reset">
          <i className="fab fa-github"></i>
        </a>
      </div>
      
    </section>
    
    <section className="">
      <div className="container text-center text-md-start mt-5">
        
        <div className="row mt-3">
          
          <div className="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
          
            <h6 className="text-uppercase fw-bold mb-4">
              <i className="fas fa-gem me-3"></i>Valinor Viagens
            </h6>
            <p>
              O Único site de viagens que possibilita a todos os amantes da obra de J.R.R. Tolkien e qualquer outra
              pessoa
              viajar por esse mundo fantástico da Terra Média!
            </p>
          </div>
          
          <div className="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
            
            <h6 className="text-uppercase fw-bold mb-4">
              Páginas e produtos
            </h6>
            <p>
              <a href="index.html" className="text-reset">Home</a>
            </p>
            <p>
              <a href="destino.html" className="text-reset">Destino</a>
            </p>
            <p>
              <a href="promocoes.html" className="text-reset">Promoções</a>
            </p>
            <p>
              <a href="contato.html" className="text-reset">Contato</a>
            </p>
          </div>
          
          <div className="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
           
            <h6 className="text-uppercase fw-bold mb-4">
              Links Úteis
            </h6>
            <p>
              <a href="https://www.valinor.com.br/" className="text-reset">Valinor</a>
            </p>
            <p>
              <a href="https://www.jrrtolkien.com.br/" className="text-reset">Sociedade de Tolkien brasileira</a>
            </p>
            <p>
              <a href="https://terramedia.fandom.com/wiki/P%C3%A1gina_principal" className="text-reset">Fandom</a>
            </p>
            <p>
              <a href="https://www.primevideo.com/detail/amzn1.dv.gti.f856462e-f3f0-47d6-99a7-8e7900ffb935?ref_=dvm_crs_prm_br_mc_s_d_pmpbanner_uap" className="text-reset">Os
                Anéis de poder</a>
            </p>
          </div>
          
          <div className="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
            
            <h6 className="text-uppercase fw-bold mb-4">
              Contato
            </h6>
            <p><i className="fas fa-home me-3"></i> Condado dos Hobbits, Quarta Oeste 60, TM</p>
            <p>
              <i className="fas fa-envelope me-3"></i>
              valinorviagens@terramedia.com
            </p>
            <p><i className="fas fa-phone me-3"></i> + 99 132 567 33</p>
            <p><i className="fas fa-print me-3"></i> + 99 234 098 89</p>
          </div>
        
        </div>
        
      </div>
    </section>

    <div className="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
      © 2022 Copyright:
      <a className="text-reset fw-bold" href="index.html">Valinor Viagens</a>
    </div>
    
  </footer>
    )
}