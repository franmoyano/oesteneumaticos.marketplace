import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaNeumaticosComponent } from './lista-neumaticos/lista-neumaticos.component';
import { HeaderComponent } from './header/header.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { GridProductosComponent } from './grid-productos/grid-productos.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaNeumaticosComponent,
    HeaderComponent,
    GridProductosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
