import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { BlogViewComponent } from './pages/blog-view/blog-view.component';
import { SubscribeFormComponent } from './pages/subscribe-form/subscribe-form.component';
import { BlogCreateComponent } from './pages/blog-create/blog-create.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'blog-profile', component: BlogViewComponent },
  { path: 'subscribe', component: SubscribeFormComponent },
  { path: 'create-blog', component: BlogCreateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
