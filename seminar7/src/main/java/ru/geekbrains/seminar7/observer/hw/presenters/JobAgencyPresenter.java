//package ru.geekbrains.seminar7.observer.hw.presenters;
//
//import ru.geekbrains.seminar7.observer.hw.models.Vacancy;
//import ru.geekbrains.seminar7.observer.hw.models.VacancyArrayList;
//
//public class JobAgencyPresenter implements ViewObserver{
//    private Model model;
//    private View view;
//    public JobAgencyPresenter(Model model, View view){
//        this.model = model;
//        this.view = view;
//        this.view.registerObserver(this);
//    }
//
//    public VacancyArrayList<Vacancy> loadVacancies(){
//        return model.loadVacancies();
//    }
//
//    public void getNewVacancy(Vacancy newVacancy) {
//        int vacancyNo = model.getNewVacancy(newVacancy);
//    }
//
//    @Override
//    public void updateVacanciesUI() {
//        view.showVacancies(loadVacancies());
//    }
//
//    public void sendOffer(Vacancy vacancy) {
//        int vacancyNo = model.sendOffer(vacancy);
//    }
//}
