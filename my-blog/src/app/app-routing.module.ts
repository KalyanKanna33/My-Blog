import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { BlogViewComponent } from './pages/blog-view/blog-view.component';
import { SubscribeFormComponent } from './pages/subscribe-form/subscribe-form.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'blog-profile', component: BlogViewComponent },
  { path: 'subscribe', component: SubscribeFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
