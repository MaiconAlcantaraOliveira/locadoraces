import { HistoricoSingleton } from './singleton/historico-singleton.component';
import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';



  constructor() {
    //this.obter()
  }

  obter() {
    const  scoreManager = HistoricoClass.getInstance();
    scoreManager.setScore(10);
    scoreManager.addPoints(1);
    scoreManager.removePoints(2);
    console.log( scoreManager.getScore() );
  }



}
