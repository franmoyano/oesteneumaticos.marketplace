import { Component, OnInit } from '@angular/core';
import { Neumatico } from '../neumatico';

@Component({
  selector: 'app-lista-neumaticos',
  templateUrl: './lista-neumaticos.component.html',
  styleUrls: ['./lista-neumaticos.component.css']
})
export class ListaNeumaticosComponent implements OnInit {

  neumaticos: Neumatico[];

  constructor() { }

  ngOnInit(): void {
    this.neumaticos = [{
      "id": 1,
      "categoria": 2100,
      "marca": "Fate",
      "ancho": 175,
      "perfil": 70,
      "rodado": 13
    },
    {
      "id": 2,
      "categoria": 2100,
      "marca": "Yokohama",
      "ancho": 185,
      "perfil": 65,
      "rodado": 14
    },
    {
      "id": 3,
      "categoria": 2100,
      "marca": "Yokohama",
      "ancho": 185,
      "perfil": 65,
      "rodado": 14
    },
    {
      "id": 4,
      "categoria": 2100,
      "marca": "Yokohama",
      "ancho": 185,
      "perfil": 65,
      "rodado": 14
    }
    ]
  }

}
