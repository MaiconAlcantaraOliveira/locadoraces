import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { PainelPrincipalComponent } from './view/painel-principal/painel-principal.component';


@NgModule({
  declarations: [
    AppComponent,
    PainelPrincipalComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
