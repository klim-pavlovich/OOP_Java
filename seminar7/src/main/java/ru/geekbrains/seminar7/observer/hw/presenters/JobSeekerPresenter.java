//package ru.geekbrains.seminar7.observer.hw.presenters;
//
//import ru.geekbrains.seminar7.observer.hw.models.Vacancy;
//
//public class JobSeekerPresenter implements ViewObserver {
//
//    private Model model;
//    private View view;
//    public JobSeekerPresenter(Model model, View view){
//        this.model = model;
//        this.view = view;
//        this.view.registerObserver(this);
//    }
//
//    public void subscribe() {
//        model.addObserver();
//    }
//
////    public void unsubscribe() {
////        jobAgent.removeObserver(this);
////    }
////
////    @Override
////    public void update(Vacancy vacancy) {
////        view.showVacancy(vacancy);
////    }
//    @Override
//    public boolean receiveOffer(Vacancy vacancy) {
//        return false;
//    }
//}
