import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';
import { BlogViewComponent } from './pages/blog-view/blog-view.component';
import { FormsModule } from '@angular/forms';
import { SubscribeFormComponent } from './pages/subscribe-form/subscribe-form.component';
import { BlogCreateComponent } from './pages/blog-create/blog-create.component';
import { HttpClientModule } from '@angular/common/http';
import { ImageComponentComponent } from './layout/image-component/image-component.component';
import { CardsComponent } from './layout/cards/cards.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    BlogViewComponent,
    SubscribeFormComponent,
    BlogCreateComponent,
    ImageComponentComponent,
    CardsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
